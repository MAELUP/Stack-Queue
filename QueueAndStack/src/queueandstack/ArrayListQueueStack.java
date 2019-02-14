/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueandstack;

;
import java.util.List;
import java.util.ArrayList;



public class ArrayListQueueStack<Obj> implements Stack<Obj>, Queue<Obj> {

    private ArrayList<Obj> item;

    public ArrayListQueueStack() {
        item = new ArrayList<Obj>();
    }

    @Override
    public void addStack(Obj itemAdd) {
        item.add(itemAdd);
    }

    @Override
    public void removeStack() {

        if (item.get(item.size() - 1) == null) {
            System.out.println("please add item");
        } else {
            item.remove(item.size() - 1);
            ArrayList<Obj> itemNew = new ArrayList<Obj>();
            for (int i = 0; i < item.size(); i++) {
                if (item.get(0) != null) {
                    itemNew.add(item.get(i));
                }
            }
            this.item = itemNew;
        }

    }

    @Override
    public void addQueue(Obj itemAdd) {
        item.add(itemAdd);
    }

    @Override
    public void removeQueue() {

        if (item.get(0) == null) {
            System.out.println("please add item");
        } else {
            item.remove(0);
            ArrayList<Obj> itemNew = new ArrayList<Obj>();
            for (int i = 0; i < item.size(); i++) {
                if (item.get(0) != null) {
                    itemNew.add(item.get(i));
                }
            }
            this.item = itemNew;
        }
    }

    @Override
    public String toString() {
        return "ArrayListQueueStack{" + "item=" + item + '}';
    }

}
