package Task9;
//1.3 Создать класс Зоопарк в котором будут жить наши животные.
//В качестве поля в новом классе будет массив из животных (private Animal[]animals).
public class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

   /*1.4 Реализовать метод в классе зоопарк по добавлению нового животного.
   Сигнатура метода будет такая: public void addAnimal(Animal animal);
   Данный метод должен будет скопировать текущий массив с животными в новый массив с животными.
   Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
    Полученный массив нужно перезаписать в поле animals в классе Зоопарк.*/

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1]; //новый массив newAnimals длиной на 1 больше текущего массива animals

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];//копирует все существующие объекты из массива animals в новый массив newAnimals
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;

    }

    //1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
    public Animal[] getAnimals() {
        return animals;
    }

    //Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.
    public void showAllAnimalInfo() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
