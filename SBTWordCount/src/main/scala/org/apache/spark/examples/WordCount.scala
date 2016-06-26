package org.apache.spark.examples

import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args: Array[String]): Unit = {
      val logFile = "/Users/mr_maggie/workspace/test/input.txt" // Should be some file on your system
      val conf = new SparkConf().setAppName("WordCount")
      val sc = new SparkContext(conf)
      val logData = sc.textFile(logFile, 2).cache()
      val numAs = logData.filter(line => line.contains("a")).count()
      val numBs = logData.filter(line => line.contains("b")).count()
      println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

  }
}
