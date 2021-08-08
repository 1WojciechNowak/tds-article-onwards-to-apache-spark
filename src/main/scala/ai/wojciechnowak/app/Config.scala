package ai.wojciechnowak.app

import org.apache.spark.sql.types._

object Config {

  implicit val heartSchema: StructType = StructType(Array(
    StructField("age", IntegerType, nullable = false),
    StructField("sex", IntegerType, nullable = false),
    StructField("cp", IntegerType, nullable = false),
    StructField("rbp", IntegerType, nullable = false),
    StructField("chol", IntegerType, nullable = false),
    StructField("fbste", IntegerType, nullable = false),
    StructField("restecg", IntegerType, nullable = false),
    StructField("mhr", IntegerType, nullable = false),
    StructField("exng", IntegerType, nullable = false),
    StructField("output", IntegerType, nullable = false)
  ))
}