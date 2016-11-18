/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanoid;

/**
 *
 * @author new
 */
class Human implements Comparable {

    public int age;

    Human(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        Human tmp = (Human) obj;

        if (this.age < tmp.age) {

            return -1;
        } else if (this.age > tmp.age) {

            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }
    // boolean getAge() {
    //      return false;
//   }
}
