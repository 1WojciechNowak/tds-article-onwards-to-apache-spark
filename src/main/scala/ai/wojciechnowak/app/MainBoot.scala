package ai.wojciechnowak.app

import org.apache.spark.sql.DataFrame
import ai.wojciechnowak.app.Config._

object MainBoot extends App  {

  // Data Loading
  val inputDF: DataFrame = InputReader
    .readCsv("heart")

  inputDF.show()
}
