package org.example;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar(
                "",0,Builder.FENDER.toString(),"Stratocastor",
                Type.ELECTRIC.toString(), Wood.ALDER.toString(), Wood.ALDER.toString()
        );

        List matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("  We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n     " +
                        guitar.getBackWood() + " back and sides,\n     " +
                        guitar.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, Builder.COLLINGS.toString(),
                "CJ", Type.ACOUSTIC.toString(),
                Wood.INDIAN_ROSEWOOD.toString(), Wood.SITKA.toString());
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER.toString(),
                "Stratocastor", Type.ELECTRIC.toString(),
                Wood.ALDER.toString(), Wood.ALDER.toString());
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER.toString(),
                "Stratocastor", Type.ELECTRIC.toString(),
                Wood.ALDER.toString(), Wood.ALDER.toString());
        inventory.addGuitar("122784", 5495.95, Builder.MARTIN.toString(),
                "D-18", Type.ACOUSTIC.toString(),
                Wood.MAHOGANY.toString(), Wood.ADIRONDACK.toString());
        inventory.addGuitar("76531", 6295.95, Builder.MARTIN.toString(),
                "OM-28", Type.ACOUSTIC.toString(),
                Wood.BRAZILIAN_ROSEWOOD.toString(), Wood.ADIRONDACK.toString());
        inventory.addGuitar("70108276", 2295.95, Builder.GIBSON.toString(),
                "Les Paul", Type.ELECTRIC.toString(),
                Wood.MAHOGANY.toString(), Wood.MAHOGANY.toString());
        inventory.addGuitar("82765501", 1890.95, Builder.GIBSON.toString(),
                "SG '61 Reissue", Type.ELECTRIC.toString(),
                Wood.MAHOGANY.toString(), Wood.MAHOGANY.toString());
        inventory.addGuitar("77023", 6275.95, Builder.MARTIN.toString(),
                "D-28", Type.ACOUSTIC.toString(),
                Wood.BRAZILIAN_ROSEWOOD.toString(), Wood.ADIRONDACK.toString());
        inventory.addGuitar("1092", 12995.95, Builder.OLSON.toString(),
                "SJ", Type.ACOUSTIC.toString(),
                Wood.INDIAN_ROSEWOOD.toString(), Wood.CEDAR.toString());
        inventory.addGuitar("566-62", 8999.95, Builder.RYAN.toString(),
                "Cathedral", Type.ACOUSTIC.toString(),
                Wood.COCOBOLO.toString(), Wood.CEDAR.toString());
        inventory.addGuitar("6 29584", 2100.95, Builder.PRS.toString(),
                "Dave Navarro Signature", Type.ELECTRIC.toString(),
                Wood.MAHOGANY.toString(), Wood.MAPLE.toString());
    }
}
