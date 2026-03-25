class Architect {
    String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesignName(String interiorDesignName) {
        boolean isInteriorDesignNameAdded = false;
        if (interiorDesignName != null && !interiorDesignName.isEmpty()) {
            interiorDesignNames[index] = interiorDesignName;
            index++;
            isInteriorDesignNameAdded = true; 
        } else {
            System.out.println(interiorDesignName + "is invalid");
        }
        return isInteriorDesignNameAdded;
    }

    public void getInteriorDesignNames() {
        for(String interiorDesignName : interiorDesignNames) {
            System.out.println(interiorDesignName);
        }
    }
}