# demo-couchbase
Demo proyect for benchmark .save and .findOne from local Couchbase 5, using Spring Data JPA and plain java sdk.

## Quick results
* benchmark1_1: Insertar 10 objetos de 2.3mb en memoria y 2.1mb en disco sin formatear
* benchmark1_2: Buscar 10 objetos de 2.3mb en memoria y 2.1mb en disco sin formatear
* benchmark2_1: Insertar 100 objetos de 0.23mb en memoria y 0.21mb en disco
* benchmark2_2: Buscar 100 objetos de 0.23mb en memoria y 0.21mb en disco
* benchmark3_1: Insertar 10 strings, del objeto serializado ya, usando el cliente sdk sin pasar por spring data jpa.
* benchmark3_2: Recuperar esos 10 objetos sin intentar pasarlo a la entidad JPA.

| Benchmark                          | Mode | Cnt | Score    | Error     | Units |
| ---------------------------------- | ---- | --- | -------- | --------- | ----- |
| ProcessFeedBenchMark.benchmark1_1  |  ss  | 10  | 4225,438 | ± 501,598 | ms/op |
| ProcessFeedBenchMark.benchmark1_2  |  ss  | 10  | 3922,575 | ± 618,488 | ms/op |
| ProcessFeedBenchMark.benchmark2_1  |  ss  | 10  | 4784,292 | ± 658,614 | ms/op |
| ProcessFeedBenchMark.benchmark2_2  |  ss  | 10  | 4603,283 | ± 471,908 | ms/op |
| ProcessFeedBenchMark.benchmark3_1  |  ss  | 10  | 2274,323 | ± 194,141 | ms/op |
| ProcessFeedBenchMark.benchmark3_2  |  ss  | 10  |  388,043 | ±  78,313 | ms/op |

## For test localy
* You need setup a [docker](https://hub.docker.com/r/couchbase/server/) couchbase
* With [default spring data jpa couchbase](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-couchbase), if you want .findAll you need to implement couchbase views.
* With default spring data jpa implementation, we haven user for bucket, and couchbase 5 implements username/password security. You'll need create the user with same name as bucket. It's explain [here](https://stackoverflow.com/questions/46995003/couchbase-5-bucket-password-setting)
* This is the [plain java sdk](https://github.com/couchbase/couchbase-java-client)
* The benchmark use [JMH](http://www.baeldung.com/java-microbenchmark-harness) remember compile from commanline form annotations do it's job.
* The too use, [profiler for memory usage](https://github.com/DimitrisAndreou/memory-measurer) through this [maven fork](https://github.com/msteindorfer/memory-measurer) remember add -javaagent:/PATH/TO/LIB/object-explorer.jar

# TODO
* Re-think the unit-benchmark to avoid posible cache effects in consecutive reads.
** The setup of query benchmark must write x1000 elements more and random (without repeat).
** The default benchmark runs 10 times, and the hardcode loop iterate 10 times over the elements.
* Clean code, hardcode paths and variables.
* Inprove the connection settings to plain couchbase sdk.
* Pull-request for [spring-data-jpa](http://www.baeldung.com/couchbase-sdk-spring) with [jsoniter](http://jsoniter.com/java-features.html#static-code-generation) (instead default jackson)