package com.li.strategy;

public class Cat  implements ComParable<Cat>
{
    int age;
    int weight;



    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", weight=" + weight + '}';
    }

    @Override
    public int compareTo(Cat o) {

            if (this.weight < o.weight) {
                return 1;
            } else if (this.weight > o.weight) {
                return -1;
            } else
                return 0;


    }
}
