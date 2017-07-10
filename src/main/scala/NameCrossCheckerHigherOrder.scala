import com.github.tototoshi.csv._
import java.io._


object NameCrossCheckerHigherOrder {
  def main(args: Array[String]): Unit ={

    val readerOne = CSVReader.open( new File("src/main/scala/SampleSpreadsheet1.csv"))
    val csvOne = readerOne.all()

    val readerTwo = CSVReader.open( new File("src/main/scala/SampleSpreadsheet2.csv"))
    val csvTwo = readerTwo.all()

    val flatCsvOne = csvOne.flatten
    val flatCsvTwo = csvTwo.flatten

    val result = flatCsvOne.filter( name => flatCsvTwo.contains(name) )
    print(result)




    readerOne.close()
    readerTwo.close()
  }
}