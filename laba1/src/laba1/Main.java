package laba1;
import laba1.Student;

public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Student grigory = new Student("Grish", 2, 5, 5);
    Student ivan = new Student("Ivan" , 5, 5, 5);
    Student petr = new Student("Petr", 2, 3, 5);
    
	
	
	System.out.println("Otlichniki:"); // запускаем вначале вывод слово Отличники 
	if (grigory.Two()) { // проверияем есть ли двойка у георгия, если она есть то false, если ее нет то true 
        System.out.println(grigory.toString()); // выводим получивишиеся данные данные через метод toString
    }
	else if (ivan.Two()) { //проверияем есть ли двойка у Ивана, если она есть то false, если ее нет то true  
        System.out.println(ivan.toString()); //выводим получивишиеся данные данные через метод toString
    }
	else if (petr.Two()) { // проверияем есть ли двойка у Петра , если она есть то false, если ее нет то true 
        System.out.println(petr.toString()); //выводим получивишиеся данные данные через метод toString
    }
	
	System.out.println(" Sreedniy avg Grishi = " + grigory.Avg() +"\n" + " Sreedniy avg Ivana = " + ivan.Avg()+"\n" + " Sreedniy avg Petora= " + petr.Avg()); // выводим получившиеся данные
	
	}

}
