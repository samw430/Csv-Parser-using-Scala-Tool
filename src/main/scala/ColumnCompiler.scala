import com.github.tototoshi.csv._
import java.io._
import java.util
import scala.collection.mutable.ListBuffer

object ColumnCompiler {

  def main( args: Array[String] ): Unit = {
    val reader = CSVReader.open( new File("src/main/scala/SampleSpreadsheet1.csv"))
    val csvFile = reader.all()

    val numberOfColumns = csvFile(0).length
    val lengthOfColumns = csvFile.length

    for ( a <- 0 to numberOfColumns-1 ) {
      var currentColumn = new ListBuffer[String]()
      for (b <- 0 to lengthOfColumns-1 ){
        currentColumn += csvFile(b)(a)
      }
      println(currentColumn)
    }
  }
}