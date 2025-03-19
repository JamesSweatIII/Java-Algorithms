// Name: James Sweat III
// Computing ID: jes9hd@virginia.edu
// Homework Name: Module 2 - RobotZookeeper
// Resources used (if applicable):
	
public class RobotZookeeper {
	
	
	public Food feedAnimal(Animal animal) {
		
		if (animal == Animal.ELEPHANT) {
			
			return Food.LEAVES;
			
		} else if (animal == Animal.LION) {
			
			return Food.MEAT;
			
		} else if (animal == Animal.MONKEY) {
			
			return Food.FRUIT;
		}
		
		return null;
	}
	//Accepts an enum type Animal, returns an enum type Food.
	
	public Toy entertainAnimal(Animal animal) {
		
		if (animal == Animal.ELEPHANT) {
			
			return Toy.HAT;
			
		} else if (animal == Animal.LION) {
			
			return Toy.BOX;
			
		} else if (animal == Animal.MONKEY) {
			
			return Toy.BALL;
		}
		
		return null;
	}
	//Accepts an enum type Animal, returns an enum type Toy.
	
	public Attention showAttention(Animal animal) {
		
		if (animal == Animal.ELEPHANT) {
			
			return Attention.SCRATCHES;
			
		} else if (animal == Animal.LION) {
			
			return Attention.PETS;
			
		} else if (animal == Animal.MONKEY) {
			
			return Attention.TALKING;
		}
	
		return null;
		}
	//Accepts an enum type Animal, returns an enum type Attention.
	
	public Animal handleRequests(AnimalNeed elephantNeed, AnimalNeed lionNeed, AnimalNeed monkeyNeed) {
		int smallest = getSmallest(monkeycount, elephantcount, lioncount);
		
		if (elephantcount == smallest) {
		
			if (elephantNeed == AnimalNeed.TOYS) {
				
				entertainAnimal(Animal.ELEPHANT);
				elephantcount++;
				setElephantScore(elephantcount);
				
				return Animal.ELEPHANT;
				
			} else if (elephantNeed == AnimalNeed.FOOD) {
				
				feedAnimal(Animal.ELEPHANT);
				elephantcount++;
				setElephantScore(elephantcount);
				
				return Animal.ELEPHANT;
				
			} else if (elephantNeed == AnimalNeed.ATTENTION) {
				
				showAttention(Animal.ELEPHANT);
				elephantcount++;
				setElephantScore(elephantcount);
				
				return Animal.ELEPHANT;
				
			}
			
		} else if (lioncount == smallest) {
				
			if (lionNeed == AnimalNeed.TOYS) {
				
				entertainAnimal(Animal.LION);
				lioncount++;
				setLionScore(lioncount);
				
				return Animal.LION;
				
			} else if (lionNeed == AnimalNeed.FOOD) {
				
				feedAnimal(Animal.LION);
				lioncount++;
				setLionScore(lioncount);
				
				return Animal.LION;
				
			} else if (lionNeed == AnimalNeed.ATTENTION) {
				
				showAttention(Animal.LION);
				lioncount++;
				setLionScore(lioncount);
				
				return Animal.LION;
				
			}
			
		} else {
			
			if (monkeyNeed == AnimalNeed.TOYS) {
				
				entertainAnimal(Animal.MONKEY);
				monkeycount++;
				setMonkeyScore(monkeycount);
				
				return Animal.MONKEY;
				
			} else if (monkeyNeed == AnimalNeed.FOOD) {
				
				feedAnimal(Animal.MONKEY);
				monkeycount++;
				setMonkeyScore(monkeycount);
				
				return Animal.MONKEY;
				
			} else if (monkeyNeed == AnimalNeed.ATTENTION) {
				
				showAttention(Animal.MONKEY);
				monkeycount++;
				setMonkeyScore(monkeycount);
				
				return Animal.MONKEY;
				
			}
		}
		
		return null;
	}
//	
	
	public int getMonkeyScore() {
		return monkeycount;}
	
	public void setMonkeyScore(int score) {
		
		monkeycount = score;
		
	}
	
	public int getLionScore(){
		return lioncount;}
	
	public void setLionScore(int score){
		
		lioncount = score;
	}
	
	public int getElephantScore(){
		return elephantcount;}
	
	public void setElephantScore(int score){

		
		elephantcount = score;
		
	}
	
	public int getSmallest(int m, int l, int e) {


		
		int smallest;
		
		if(lioncount < elephantcount && lioncount < monkeycount) {
			
	            smallest = lioncount;
	            
	        } else if (elephantcount < monkeycount) {
	        	
	            smallest = elephantcount;
	            
	        } else {
	        	
	            smallest = monkeycount;
	        }
	    return smallest;
	}
	
	
	int monkeycount, lioncount, elephantcount;
	
	

}

enum Animal {
	LION, ELEPHANT, MONKEY

}

enum AnimalNeed {
	FOOD, TOYS, ATTENTION
}

enum Food {
	FRUIT, LEAVES, MEAT

}

enum Toy {
	BALL, HAT, BOX

}

enum Attention {
	 SCRATCHES, PETS, TALKING;
}


