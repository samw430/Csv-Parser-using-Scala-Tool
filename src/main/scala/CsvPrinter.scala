import com.github.tototoshi.csv._
import java.io._

object CsvPrinter {
  def main(args: Array[String]) = {
   val reader = CSVReader.open( new File("src/main/scala/sample.csv"))
   val printed = reader.all()
    print( printed )
  }
}
