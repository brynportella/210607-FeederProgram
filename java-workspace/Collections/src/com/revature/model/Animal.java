package com.revature.model;

public class Animal {
	//class or static scope
		//One copy shared among all animals 
		//Accessible through the name of the class
		//Animal.numberOfAnimals 
		private static int numberOfAnimals; 
		
		//instance or object scope
		//each instance or object gets its own copy 
		protected String name= "Animal Name";
		
		public Animal() {
			//name = "Animal name";
		}
		
		public Animal(String name) {
			this.name = name; 
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animal other = (Animal) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Animal [name=" + name + "]";
		} 
}
