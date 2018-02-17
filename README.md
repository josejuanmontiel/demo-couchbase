# demo-couchbase
Demo project for benchmark .save and .findOne from local Couchbase 5, using Spring Data JPA and plain java sdk.

## Quick results
* benchmark1_1: Insert 10 objets (2.3mb in memory stucture) and 2.1mb (in file without formating json)
* benchmark1_2: Search 10 objets (2.3mb in memory stucture) and 2.1mb (in file without formating json)
* benchmark2_1: Insert 100 objets (0.23mb in memory stucture) and 0.21mb (in file without formating json)
* benchmark2_2: Search 100 objets (0.23mb in memory stucture) and 0.21mb (in file without formating json)
* benchmark3_1: Insert 10 strings, don't count the time to serialize to string, using plain java sdk
* benchmark3_2: Search this 10 objects, using plain sdk.

| Benchmark                          | Mode | Cnt | Score    | Error     | Units |
| ---------------------------------- | ---- | --- | -------- | --------- | ----- |
| ProcessFeedBenchMark.benchmark1_1  |  ss  | 10  | 4225,438 | ± 501,598 | ms/op |
| ProcessFeedBenchMark.benchmark1_2  |  ss  | 10  | 3922,575 | ± 618,488 | ms/op |
| ProcessFeedBenchMark.benchmark2_1  |  ss  | 10  | 4784,292 | ± 658,614 | ms/op |
| ProcessFeedBenchMark.benchmark2_2  |  ss  | 10  | 4603,283 | ± 471,908 | ms/op |
| ProcessFeedBenchMark.benchmark3_1  |  ss  | 10  | 2274,323 | ± 194,141 | ms/op |
| ProcessFeedBenchMark.benchmark3_2  |  ss  | 10  |  388,043 | ±  78,313 | ms/op |

## For test localy
* You need setup a [docker](https://hub.docker.com/r/couchbase/server/) Couchbase 5
* With [default spring data jpa couchbase](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-couchbase), if you want .findAll you need to implement couchbase views.
* With default spring data jpa implementation, we haven't user for bucket, and Couchbase 5 implements username/password security for bucket accesss. You'll need create the user with same name as bucket. It's explain [here](https://stackoverflow.com/questions/46995003/couchbase-5-bucket-password-setting)
* This is the [plain java sdk](https://github.com/couchbase/couchbase-java-client)
* The benchmark use [JMH](http://www.baeldung.com/java-microbenchmark-harness). Remember compile from commandline for annotations do it's job.
* This use too, [profiler for memory usage](https://github.com/DimitrisAndreou/memory-measurer) through this [maven fork](https://github.com/msteindorfer/memory-measurer) remember add -javaagent:/PATH/TO/LIB/object-explorer.jar

# TODO
* Re-think the unit-benchmark to avoid posible cache effects in consecutive reads.
** The setup of query benchmark must write x1000 elements more and random (without repeat).
** The default benchmark runs 10 times, and the hardcode loop iterate 10 times over the elements.
* Clean code, hardcode paths and variables.
* Inprove the connection settings to plain couchbase java sdk.
* Pull-request for [spring-data-jpa](http://www.baeldung.com/couchbase-sdk-spring) with [jsoniter](http://jsoniter.com/java-features.html#static-code-generation) (instead default jackson)