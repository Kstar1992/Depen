package utility

import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by kunal on 30/1/17.
  */
object CreateDataframe {

 //This is Version 2
  def getDataframe(path: String): DataFrame = {
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("CMSHCCLocal")
    val sc = new SparkContext(sparkConf)
    val sqlContext = new SQLContext(sc)
    val ipDFPersonCSV = sqlContext.read.format("com.databricks.spark.csv")
      .option("header", "true")
      .load(path)
    ipDFPersonCSV
  }

}
