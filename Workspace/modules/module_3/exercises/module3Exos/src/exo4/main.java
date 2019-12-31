package exo4;

public class main {

	public static void main(String[] args) {
		Cat cat = new Cat("Lucy", 16,"Magenta",75);
		
		System.out.println(cat);
		cat.eat("tuna");
		cat.drink("chicken milk");
		cat.migrate();
		cat.sound();
		
		Lion lion = new Lion("rocky",9,"FireBrick",110);
		System.out.println(lion);
		lion.eat("kibbles");
		lion.drink("water");
		lion.migrate();
		lion.sound();
		
		Dog dog = new Dog("cookie",4,"black",10);
		System.out.println(dog);
		dog.eat("biscuits");
		dog.drink("Literally anything that flows");
		dog.migrate();
		dog.sound();
		dog.fetch();
		dog.lick();
		dog.chaseTail();
		dog.dig();
		
		Wolf wolf = new Wolf("Rex", 7, "white", 200);
		System.out.println(wolf);
		wolf.migrate();
		wolf.sound();
		wolf.fetch();
		wolf.lick();
		wolf.chaseTail();
		wolf.dig();
		
		

	}

}
