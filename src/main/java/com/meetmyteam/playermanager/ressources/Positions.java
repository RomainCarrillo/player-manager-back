package com.meetmyteam.playermanager.ressources;

import com.meetmyteam.playermanager.domain.TeamPosition;

import java.util.ArrayList;


public class Positions {

    public static ArrayList<TeamPosition> positions = new ArrayList<TeamPosition>();

    public static ArrayList<TeamPosition> getPositions() {
        positions.add(new TeamPosition(1, "Pilier gauche", false));
        positions.add(new TeamPosition(2, "Talonneur", false));
        positions.add(new TeamPosition(3, "Pilier droit", false));
        positions.add(new TeamPosition(4, "Deuxième ligne", false));
        positions.add(new TeamPosition(5, "Deuxième ligne", false));
        positions.add(new TeamPosition(6, "Troisième ligne aile", false));
        positions.add(new TeamPosition(7, "Troisième ligne aile", false));
        positions.add(new TeamPosition(8, "Troisième ligne centre", false));
        positions.add(new TeamPosition(9, "Demi de mélée", false));
        positions.add(new TeamPosition(10, "Demi d'ouverture", false));
        positions.add(new TeamPosition(11, "Premier centre", false));
        positions.add(new TeamPosition(12, "Deuxième centre", false));
        positions.add(new TeamPosition(13, "Ailier", false));
        positions.add(new TeamPosition(14, "Ailier", false));
        positions.add(new TeamPosition(15, "Arrière", false));
        positions.add(new TeamPosition(16, "Finisseur 1", false));
        positions.add(new TeamPosition(17, "Finisseur 2", false));
        positions.add(new TeamPosition(18, "Finisseur 3", false));
        positions.add(new TeamPosition(19, "Finisseur 4", false));
        positions.add(new TeamPosition(20, "Finisseur 5", false));
        positions.add(new TeamPosition(21, "Finisseur 6", false));
        positions.add(new TeamPosition(22, "Finisseur 7", false));
        positions.add(new TeamPosition(0, "Entraineur", true));
        positions.add(new TeamPosition(0, "Dirigeant accès terrain", true));
        positions.add(new TeamPosition(0, "Soigneur", true));
        positions.add(new TeamPosition(0, "Administratif", true));
        return positions;
    }
}


///int number, String name, boolean staff
