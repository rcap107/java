package examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Examples {

	public static void main(String[] args) {
		
		Collection<Person> c = new LinkedList<>();
		
		c.add(new Person(1,"Giuseppe","Verdi"));
		
		//c.add( new Integer(1));
		
		for( Person p : c){
			System.out.println( p );
		}
		
	   Person gv = new Person(1,"Giuseppe","Verdi");
	   
	   if( c.contains( gv ) ){
		   System.out.println("We have him");
	   }
	   
	   System.out.println("c contains " + c.size() + " elements");
	   
	   
	   Map<Integer,Person> persons = new HashMap<>();
	   
	   persons.put( new Integer(1), gv);
	   
	   
	   Person p = persons.get( 1 );
	   
	   
	   if( ! persons.containsKey( 1 )){
		   persons.put( 1 , new Person(1,"Mario","Rossi"));
	   }
	   
	   p = persons.get( 99 );
	   if( p==null ){
		   System.out.println("Non existing key!");
	   }
	   
	   

	}

}
