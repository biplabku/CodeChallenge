import java.util.Queue;

public class animalShelter {

    public Queue<Dogs> Dogs;
    public Queue<Cats> Cats;
    public int order = 0;

    public void enQueue(String value) {
        if(value == "cat") {
            Cats cat = new Cats(value);
            int val = order++;
            cat.setOrder(val);
            Cats.add(cat);
        }else {
            Dogs dog = new Dogs(value);
            int val = order++;
            dog.setOrder(val);
            Dogs.add(dog);
        }
    }


    public String deQueueAny() {
        if (Dogs.size() == 0) {
            return deQueueCat();
        } else if (Cats.size() == 0) {
            return deQueueDog();
        }

        Dogs dog = Dogs.peek();
        Cats cat = Cats.peek();
        if (dog.getOrder() < cat.getOrder()) {
            return deQueueDog();
        } else {
            return deQueueCat();
        }
    }

    public String deQueueDog() {
        Dogs dog = Dogs.poll();
        return dog.data;
    }


    public String deQueueCat() {
        Cats cat = Cats.poll();
        return cat.data;
    }

    public static void main(String[] args) {
        animalShelter an = new animalShelter();
        // Still need to work  on the testing part of the code, Theoritical implementation based on the understanding of the questions
    }
}

