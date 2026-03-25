class ArchitectRunner {
    public static void main(String[] args) {
        Architect architect = new Architect();

        architect.addInteriorDesignName("Modern Minimalist");
        architect.addInteriorDesignName("Industrial Chic");
        architect.addInteriorDesignName("Scandinavian");
        architect.addInteriorDesignName("Bohemian (Boho)");
        architect.addInteriorDesignName("Mid-Century Modern");
        architect.addInteriorDesignName("Classic Traditional");
        architect.addInteriorDesignName("Art Deco");
        architect.addInteriorDesignName("Coastal / Hamptons");
        architect.addInteriorDesignName("Rustic Farmhouse");
        architect.addInteriorDesignName("Eclectic");
        architect.addInteriorDesignName("Contemporary");

        architect.getInteriorDesignNames();
    }
}