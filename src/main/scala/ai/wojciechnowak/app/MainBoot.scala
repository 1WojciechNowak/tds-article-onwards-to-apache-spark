package ai.wojciechnowak.app

import org.apache.spark.sql.{DataFrame, Dataset}
import ai.wojciechnowak.app.Config._
import ai.wojciechnowak.app.model.HeartAttackRecord

object MainBoot extends App  {

  import Env.spark.implicits._
  // Data Loading
  val inputDS: Dataset[HeartAttackRecord] = InputReader
    .readCsv("heartattack_dataset")
    .as[HeartAttackRecord]

  inputDS.show()
}
