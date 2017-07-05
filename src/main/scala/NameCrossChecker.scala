import com.github.tototoshi.csv._
import java.io._


object NameCrossChecker {
  def main(args: Array[String]): Unit ={

    val readerOne = CSVReader.open( new File("src/main/scala/SampleSpreadsheet1.csv"))
    val csvOne = readerOne.all()
    val sizeOfCsv = csvOne.length

    val readerTwo = CSVReader.open( new File("src/main/scala/SampleSpreadsheet2.csv"))
    val csvTwo = readerTwo.all()


    var numberOfLists = csvTwo.length
    var listLength = csvTwo(0).length

    for ( a <- 0 to numberOfLists-1) {
      for ( b <- 0 to listLength-1 ) {
        for ( c <- 0 to sizeOfCsv-1 )
        if (csvOne(c).contains(csvTwo(a)(b))) {
            println( csvTwo(a)(b) )
     }
   }
  }

    readerOne.close()
    readerTwo.close()
  }
}