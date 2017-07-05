import com.github.tototoshi.csv._
import java.io._


object NameCrossChecker {
  def main(args: Array[String]): Unit ={

    val readerOne = CSVReader.open( new File("src/main/scala/SampleSpreadsheet1.csv"))
    val csvOne = readerOne.all()

    val readerTwo = CSVReader.open( new File("src/main/scala/SampleSpreadsheet2.csv"))
    val csvTwo = readerTwo.all()


    var numberOfLists = csvTwo.length
    var listLength = csvTwo(0).length

  for ( a <- 0 to numberOfLists-1) {
   for ( b <- 0 to listLength-1 ) {
     if (csvOne.contains(csvTwo(a)(b))) {
       println( csvTwo(a)(b) )
       println( 2 )
     }
   }
  }

    readerOne.close()
    readerTwo.close()
  }
}