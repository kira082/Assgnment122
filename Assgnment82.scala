object Assgnment82 {
   def main(args: Array[String]) {
/*  find count of all strings with length 4
convert the list of string to a list of integers, where each string is mapped to its
corresponding length 
*/   
   var count = 0;
	  var list1: List[String] = List(“alpha”, “gamma”, “omega”, “zeta”, “beta”);
		var list2 = listl.map(_.toString().toInt);
		list2.foreach
		{
		if( _ == 4)
		{
		count = count+1;
		}
		}
		println(count);
		
		
/* find count of all strings which contain alphabet ‘m’  */
var count2 = 0;
for ( i <- 0 to (list3.length - 1)) {
 var list4 =list1.toArray;		
val comp = list4.toCharArray
    for (i <- comp){
        if ( "m" != comp(i))
            count2 = count2+1;
			break;
        }
    val str = comp.toString
    }
	}

/*- find the count of all strings which start with the alphabet ‘a’*/
 var count1 = 0;
 var list3 =list1.toArray;
 for ( i <- 0 to (list3.length - 1)) {
         var x = list3(i).charAt(0);
		 if(x =='a')
		 {
			count1 =count1+1;
		 }
      }

   }
}