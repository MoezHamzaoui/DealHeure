package com.dh.model;

import java.util.*;

public class NetworkEndpoint {
    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
        // Construire une map des liens {fromId -> toId}
        Map<Integer, Integer> linkMap = new HashMap<>();
        for (int i = 0; i < fromIds.length; i++) {
            linkMap.put(fromIds[i], toIds[i]);
        }

        // Parcourir le réseau en suivant les liens
        Set<Integer> visited = new HashSet<>();
        int currentNode = startNodeId;

        while (linkMap.containsKey(currentNode)) {
            if (visited.contains(currentNode)) {
                return currentNode; // Cycle détecté, retour du nœud en boucle
            }
            visited.add(currentNode);
            currentNode = linkMap.get(currentNode);
        }

        return currentNode; // Nœud final atteint
    }

    public static void main(String[] args) {
        int[] fromIds = {1, 2, 3, 4};
        int[] toIds = {2, 3, 5, 5};

        System.out.println(findNetworkEndpoint(2, fromIds, toIds)); // Output: 5
    }
}
