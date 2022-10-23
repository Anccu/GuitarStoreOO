package org.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    static Logger logger = Logger.getLogger(FindGuitarTester.class);
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        //BasicConfigurator.configure();
        //PropertyConfigurator.configure(args[0]);
        logger.info("inizio - loger");
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(
                Builder.FENDER,"Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER,6
        );

        List matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty()) {
            logger.info("Erin, you might like these guitars:");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec guitarSpec = guitar.getSpec();
                logger.info("  We have a " +
                        guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getType() + " guitarSpec.\n     " +
                        guitarSpec.getBackWood() + " back and sides,\n     " +
                        guitarSpec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            logger.info("Sorry, Erin, we have nothing for you");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.COLLINGS,
                "CJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.SITKA,6));
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER,6));
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER,6));
        inventory.addGuitar("122784", 5495.95, new GuitarSpec(Builder.MARTIN,
                "D-18", Type.ACOUSTIC,
                Wood.MAHOGANY, Wood.ADIRONDACK,6));
        inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN,
                "OM-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,6));
        inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Builder.GIBSON,
                "Les Paul", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY,6));
        inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Builder.GIBSON,
                "SG '61 Reissue", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY,6));
        inventory.addGuitar("77023", 6275.95, new GuitarSpec(Builder.MARTIN,
                "D-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,6));
        inventory.addGuitar("1092", 12995.95, new GuitarSpec(Builder.OLSON,
                "SJ", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.CEDAR,12));
        inventory.addGuitar("566-62", 8999.95, new GuitarSpec(Builder.RYAN,
                "Cathedral", Type.ACOUSTIC,
                Wood.COCOBOLO, Wood.CEDAR,12));
        inventory.addGuitar("6 29584", 2100.95, new GuitarSpec(Builder.PRS,
                "Dave Navarro Signature", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAPLE,6));
    }
}
