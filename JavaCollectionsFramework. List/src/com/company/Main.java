/*
*
* Classname Main
*
*  20 june 2020
*
* Created by Selebynka Yurii (UzhNU)
*
*    JavaCollectionsFramework. List.
1. Create ArrayList and LinkedList containing  10 000 Integer elements.
*  Compare time intervals.
2. Insert  new 100 elements  on the  beginning, on  the middle
*  and on the end of ones. Compare time intervals.
3. Update 100 elements  from the  beginning, from  the middle
*  and from the end of ones. Compare time intervals.
4. Delete 100 elements  from the  beginning, from  the middle
*  and from the end of ones. Compare time intervals.
*
* */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        //1. Create ArrayList and LinkedList containing 10 000 Integer \\
        // elements. Compare time intervals.\\

        //-------------- Array List -------------------------------------------

        System.out.println("CREATING OF LISTS:");

        LocalDateTime startI = LocalDateTime.now();


        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        LocalDateTime finishI = LocalDateTime.now();

        System.out.println("1. Creating of ArrayList takes "
                + ChronoUnit.MILLIS.between(startI, finishI) + " ms.");

        // ------------- Linked List ------------------------------------------

        LocalDateTime startIL = LocalDateTime.now();

        List<Integer> integersLinked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime finishIL = LocalDateTime.now();

        System.out.println("2. Creating of Linked List takes "
                + ChronoUnit.MILLIS.between(startIL, finishIL) + " ms.");

        if ((ChronoUnit.MILLIS.between(startIL, finishIL)
                < ChronoUnit.MILLIS.between(startI, finishI))) {
            System.out.println("3. Creating of Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startIL, finishIL)
                > ChronoUnit.MILLIS.between(startI, finishI))) {
            System.out.println("3. Creating of ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }


        // 2. Insert  new 100 elements  in the  beginning, in  the middle \\
        //  and in the end of ones. Compare time intervals.  \\

        //----- Array List insert new 100 elements in the beginning -----------

        System.out.println("INSERTING OF NEW 100 ELEMENTS IN THE BEGINNING:");

        LocalDateTime startIIns100EInBeginning = LocalDateTime.now();

        List<Integer> integersFirst = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersFirst.add(i);
        }

        integers.addAll(0, integersFirst);

        LocalDateTime finishIIns100EInBeginning = LocalDateTime.now();

        System.out.println("1. Inserting of new 100 elements in the beginning "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIIns100EInBeginning, finishIIns100EInBeginning)
                + " ms.");

        //----- Linked List insert new 100 elements in the beginning ----------

        LocalDateTime startILIns100EInBeginning = LocalDateTime.now();

        List<Integer> integersLinkedFirst = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedFirst.add(i);
        }

        integersLinked.addAll(0, integersLinkedFirst);

        LocalDateTime finishILIns100EInBeginning = LocalDateTime.now();

        System.out.println("2. Inserting of new 100 elements in the beginning "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILIns100EInBeginning, finishILIns100EInBeginning)
                + " ms.");

        //--- Comparison of inserting new 100 elements in the beginning -------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILIns100EInBeginning
                , finishILIns100EInBeginning)
                < ChronoUnit.MILLIS.between(startIIns100EInBeginning
                , finishIIns100EInBeginning))) {
            System.out.println("3. Inserting of new 100 elements in the " +
                    "beginning of the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILIns100EInBeginning
                , finishILIns100EInBeginning)
                > ChronoUnit.MILLIS.between(startIIns100EInBeginning
                , finishIIns100EInBeginning))) {
            System.out.println("3. Inserting of new 100 elements in the " +
                    "beginning in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //------ Array List insert new 100 elements in the middle --------------

        System.out.println("INSERTING OF NEW 100 ELEMENTS IN THE MIDDLE:");

        LocalDateTime startIIns100EInMiddle = LocalDateTime.now();

        List<Integer> integersMiddle = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersMiddle.add(i);
        }

        integers.addAll(integers.size() / 2, integersMiddle);

        LocalDateTime finishIIns100EInMiddle = LocalDateTime.now();

        System.out.println("1. Inserting of new 100 elements in the middle "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIIns100EInMiddle, finishIIns100EInMiddle) + " ms.");

        //------ Linked List insert new 100 elements in the middle ------------

        LocalDateTime startILIns100EInMiddle = LocalDateTime.now();

        List<Integer> integersLinkedMiddle = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedMiddle.add(i);
        }

        integersLinked.addAll(integersLinked.size() / 2
                , integersLinkedMiddle);

        LocalDateTime finishILIns100EInMiddle = LocalDateTime.now();

        System.out.println("2. Inserting of new 100 elements in the middle "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILIns100EInMiddle, finishILIns100EInMiddle) + " ms.");

        //--- Comparison of inserting new 100 elements in the middle ----------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILIns100EInMiddle
                , finishILIns100EInMiddle)
                < ChronoUnit.MILLIS.between(startIIns100EInMiddle
                , finishIIns100EInMiddle))) {
            System.out.println("3. Inserting of new 100 elements in the middle"
                    + " of the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILIns100EInMiddle
                , finishILIns100EInMiddle)
                > ChronoUnit.MILLIS.between(startIIns100EInMiddle
                , finishIIns100EInMiddle))) {
            System.out.println("3. Inserting of new 100 elements in the middle"
                    + " of the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //------ Array List insert new 100 elements in the end ----------------

        System.out.println("INSERTING OF NEW 1000 ELEMENTS IN THE END:");

        LocalDateTime startIIns100EInEnd = LocalDateTime.now();

        List<Integer> integersEnd = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersEnd.add(i);
        }

        integers.addAll(integersEnd);

        LocalDateTime finishIIns100EInEnd = LocalDateTime.now();

        System.out.println("1. Inserting of new 100 elements in the end "
                + "of ArrayList takes "
                + ChronoUnit.MILLIS.between(startIIns100EInEnd
                , finishIIns100EInEnd) + " ms.");

        //------ Linked List insert new 100 elements in the end ---------------

        LocalDateTime startILIns100EInEnd = LocalDateTime.now();

        List<Integer> integersLinkedEnd = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedEnd.add(i);
        }

        integersLinked.addAll(integersLinkedEnd);

        LocalDateTime finishILIns100EInEnd = LocalDateTime.now();

        System.out.println("1. Inserting of new 100 elements in the end "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILIns100EInEnd, finishILIns100EInEnd) + " ms.");

        //--- Comparison of inserting new 100 elements in the end -------------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILIns100EInEnd
                , finishILIns100EInEnd)
                < ChronoUnit.MILLIS.between(startIIns100EInEnd
                , finishIIns100EInEnd))) {
            System.out.println("3. Inserting of new 100 elements in the end "
                    + "in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILIns100EInEnd
                , finishILIns100EInEnd)
                > ChronoUnit.MILLIS.between(startIIns100EInEnd
                , finishIIns100EInEnd))) {
            System.out.println("3. Inserting of new 100 elements in the end "
                    + "in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        // 3. Update 100 elements  from the  beginning, from  the middle \\
        //and from the end of ones. Compare time intervals.\\

        //---- Array List update new 100 elements from the beginning ----------

        System.out.println("UPDATING OF NEW 100 ELEMENTS IN THE BEGINNING:");

        LocalDateTime startIUpd100InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i, i++);
        }

        LocalDateTime finishIUpd100InBeginning = LocalDateTime.now();

        System.out.println("1. Updating of new 100 elements in the beginning "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIUpd100InBeginning, finishIUpd100InBeginning) + " ms.");

        //----- Linked List update new 100 elements from the beginning --------

        LocalDateTime startILUpd100InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i);
        }

        LocalDateTime finishILUpd100InBeginning = LocalDateTime.now();

        System.out.println("2. Updating of new 100 elements in the beginning "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILUpd100InBeginning, finishILUpd100InBeginning)
                + " ms.");

        //--- Comparison of updating new 100 elements in the beginning --------
        // of ArrayList and Linked List

        if ((ChronoUnit.MILLIS.between(startILUpd100InBeginning
                , finishILUpd100InBeginning)
                < ChronoUnit.MILLIS.between(startIUpd100InBeginning
                , finishIUpd100InBeginning))) {
            System.out.println("3. Updating of new 100 elements in the " +
                    "beginning in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILUpd100InBeginning
                , finishILUpd100InBeginning)
                > ChronoUnit.MILLIS.between(startIUpd100InBeginning
                , finishIUpd100InBeginning))) {
            System.out.println("3. Updating of new 100 elements in the " +
                    "beginning in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //----- Array List update new 100 elements from the middle ------------

        System.out.println("UPDATING OF NEW 100 ELEMENTS IN THE MIDDLE:");

        LocalDateTime startIUpd100InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(integers.size() / 2 + i, i++);
        }

        LocalDateTime finishIUpd100InMiddle = LocalDateTime.now();

        System.out.println("1. Updating of new 100 elements in the middle "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIUpd100InMiddle, finishIUpd100InMiddle) + " ms.");

        //---- Linked List update new 100 elements from the middle ------------

        LocalDateTime startILUpd100InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size() / 2 + i, i++);
        }

        LocalDateTime finishILUpd100InMiddle = LocalDateTime.now();

        System.out.println("2. Updating of new 100 elements in the middle "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILUpd100InMiddle, finishILUpd100InMiddle) + " ms.");

        //--- Comparison of updating new 100 elements in the middle -----------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILUpd100InMiddle
                , finishILUpd100InMiddle)
                < ChronoUnit.MILLIS.between(startIUpd100InMiddle
                , finishIUpd100InMiddle))) {
            System.out.println("3. Updating of new 100 elements in the middle "
                    + "in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILUpd100InMiddle
                , finishILUpd100InMiddle)
                > ChronoUnit.MILLIS.between(startIUpd100InMiddle
                , finishIUpd100InMiddle))) {
            System.out.println("3. Updating of new 100 elements in the middle "
                    + "in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //----- Array List update new 100 elements from the end ---------------

        System.out.println("UPDATING OF NEW 100 ELEMENTS IN THE END:");

        LocalDateTime startIUpd100InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(integers.size() - 1000 + i, i++);
        }

        LocalDateTime finishIUpd100InEnd = LocalDateTime.now();

        System.out.println("1. Updating of new 100 elements in the end "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIUpd100InEnd, finishIUpd100InEnd) + " ms.");

        //----- Linked List update new 100 elements from the end --------------

        LocalDateTime startILUpd100InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size() - 1000 + i, i++);
        }

        LocalDateTime finishILUpd100InEnd = LocalDateTime.now();

        System.out.println("2. Updating of new 100 elements in the end "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILUpd100InEnd, finishILUpd100InEnd) + " ms.");

        //--- Comparison of updating new 100 elements in the end --------------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILUpd100InEnd
                , finishILUpd100InEnd)
                < ChronoUnit.MILLIS.between(startIUpd100InEnd
                , finishIUpd100InEnd))) {
            System.out.println("3. Updating of new 100 elements in the end "
                    + "in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILUpd100InEnd
                , finishILUpd100InEnd)
                > ChronoUnit.MILLIS.between(startIUpd100InEnd
                , finishIUpd100InEnd))) {
            System.out.println("3. Updating of new 100 elements in the end "
                    + "in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        // 4. Delete 100 elements  from the  beginning, from  the middle \\
        //  and from the end of ones. Compare time intervals. \\

        //---- Array List delete new 100 elements in the beginning ------------

        System.out.println("DELETING OF NEW 100 ELEMENTS IN THE BEGINNING:");

        LocalDateTime startIDel100InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(i);
        }

        LocalDateTime finishIDel100InBeginning = LocalDateTime.now();

        System.out.println("1. Deleting of new 100 elements in the beginning "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIDel100InBeginning, finishIDel100InBeginning) + " ms.");

        //---- Linked List delete new 100 elements in the beginning -----------

        LocalDateTime startILDel100InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(i);
        }

        LocalDateTime finishILDel100InBeginning = LocalDateTime.now();

        System.out.println("2. Deleting of new 100 elements in the beginning "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILDel100InBeginning, finishILDel100InBeginning)
                + " ms.");

        //--- Comparison of deleting new 100 elements in the beginning --------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILDel100InBeginning
                , finishILDel100InBeginning)
                < ChronoUnit.MILLIS.between(startIDel100InBeginning
                , finishIDel100InBeginning))) {
            System.out.println("3. Deleting of new 100 elements in the " +
                    "beginning in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILDel100InBeginning
                , finishILDel100InBeginning)
                > ChronoUnit.MILLIS.between(startIDel100InBeginning
                , finishIDel100InBeginning))) {
            System.out.println("3. Deleting of new 100 elements in the " +
                    "beginning in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //---- Array List delete new 100 elements in the middle ---------------

        System.out.println("DELETING OF NEW 100 ELEMENTS IN THE MIDDLE:");

        LocalDateTime startIDel100InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() / 2 + i);
        }

        LocalDateTime finishIDel100InMiddle = LocalDateTime.now();

        System.out.println("1. Deleting of new 100 elements in the middle "
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIDel100InMiddle, finishIDel100InMiddle) + " ms.");

        //---- Linked List delete new 100 elements in the middle --------------

        LocalDateTime startILDel100InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integers.size() / 2 + i);
        }

        LocalDateTime finishILDel100InMiddle = LocalDateTime.now();

        System.out.println("2. Deleting of new 100 elements in the middle "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILDel100InMiddle, finishILDel100InMiddle) + " ms.");

        //--- Comparison of deleting new 100 elements in the middle -----------
        //-- of ArrayList and Linked List -------------------------------------

        if ((ChronoUnit.MILLIS.between(startILDel100InMiddle
                , finishILDel100InMiddle)
                < ChronoUnit.MILLIS.between(startIDel100InMiddle
                , finishIDel100InMiddle))) {
            System.out.println("3. Deleting of new 100 elements in the middle "
                    + "in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILDel100InMiddle
                , finishILDel100InMiddle)
                > ChronoUnit.MILLIS.between(startIDel100InMiddle
                , finishIDel100InMiddle))) {
            System.out.println("3. Deleting of new 100 elements in the middle "
                    + "in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }

        //---- Array List delete new 100 elements in the end ------------------

        System.out.println("DELETING OF NEW 100 ELEMENTS IN THE END:");

        LocalDateTime startIDel100InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 1000 + i);
        }

        LocalDateTime finishIDel100InEnd = LocalDateTime.now();

        System.out.println("1. Deleting of new 100 elements in the end"
                + "of ArrayList takes " + ChronoUnit.MILLIS.between
                (startIDel100InEnd, finishIDel100InEnd) + " ms.");

        //---- Linked List delete new 100 elements in the end -----------------

        LocalDateTime startILDel100InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 1000 + i);
        }

        LocalDateTime finishILDel100InEnd = LocalDateTime.now();

        System.out.println("2. Deleting of new 100 elements in the end "
                + "of Linked List takes " + ChronoUnit.MILLIS.between
                (startILDel100InEnd, finishILDel100InEnd) + " ms.");

        //--- Comparison of deleting new 100 elements in the end --------------
        //-- of ArrayList and Linked List--------------------------------------

        if ((ChronoUnit.MILLIS.between(startILDel100InEnd
                , finishILDel100InEnd)
                < ChronoUnit.MILLIS.between(startIDel100InEnd
                , finishIDel100InEnd))) {
            System.out.println("3. Deleting of new 100 elements in the end "
                    + "in the Linked List is faster." + "\n");
        } else if ((ChronoUnit.MILLIS.between(startILDel100InEnd
                , finishILDel100InEnd)
                > ChronoUnit.MILLIS.between(startIDel100InEnd
                , finishIDel100InEnd))) {
            System.out.println("3. Deleting of new 100 elements in the end "
                    + "in the ArrayList is faster." + "\n");
        } else {
            System.out.println("3. Speed is equal." + "\n");
        }
    }
}
