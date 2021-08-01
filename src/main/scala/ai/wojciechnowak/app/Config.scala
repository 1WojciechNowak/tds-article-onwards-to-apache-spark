package ai.wojciechnowak.app

import org.apache.spark.sql.types._

object Config {

  implicit val heartSchema: StructType = StructType(Array(
    StructField("age", IntegerType, nullable = false),
    StructField("sex", IntegerType, nullable = false),
    StructField("cp", IntegerType, nullable = false),
    StructField("trtbps", IntegerType, nullable = false),
    StructField("chol", IntegerType, nullable = false),
    StructField("fbs", IntegerType, nullable = false),
    StructField("restecg", IntegerType, nullable = false),
    StructField("thalachh", IntegerType, nullable = false),
    StructField("exng", IntegerType, nullable = false),
    StructField("oldpeak", DoubleType, nullable = false),
    StructField("slp", IntegerType, nullable = false),
    StructField("caa", IntegerType, nullable = false),
    StructField("thall", IntegerType, nullable = false),
    StructField("output", IntegerType, nullable = false)
  ))
}