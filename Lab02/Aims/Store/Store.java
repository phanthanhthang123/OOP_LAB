//Phan Thanh Thang
//20225927
//class "Store"
package Lab02.Aims.Store;


import java.util.LinkedList;

import Lab02.Aims.Disc.DigitalVideoDisc;
public class Store {
    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();


    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if(!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }

    }

    @Override //Dinh nghia lai phuong thuc trong lop Object cua thu vien java.lang
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no dvd in the store !\n");
        else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}