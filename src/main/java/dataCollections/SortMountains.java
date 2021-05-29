package dataCollections;

import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    public static void main(String[] args) {
        new SortMountains().go();
    }



    public void go() {
        mtn.add(new Mountain("Long-range", "14255"));
        mtn.add(new Mountain("Elbert", "14433"));
        mtn.add(new Mountain("Maroon", "14156"));
        mtn.add(new Mountain("Casya", "14265"));

        System.out.println("By date:\n" + mtn);

        mtn.sort(new NameCompare());
        System.out.println("By name:\n" + mtn);

        mtn.sort(new HeightCompare());
        System.out.println("By height:\n" + mtn);
    }

    class NameCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getHeight().compareTo(two.getHeight());
        }
    }

    class Mountain {
        String name;
        String height;

        @Override
        public String toString() {
            return "Mountain{" +
                    "name='" + name + '\'' +
                    ", height='" + height + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public String getHeight() {
            return height;
        }

        public Mountain(String name, String height) {
            this.name = name;
            this.height = height;
        }
    }

}
