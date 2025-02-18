package com.dh.model;

public class DiskSize {

    public static int computeSizeOnDisk(int clusterSize, int fileSize) {
        int nbCluster = (fileSize + clusterSize - 1) / clusterSize;
        return nbCluster * clusterSize;
    }

    public static void main(String[] args) {
        System.out.println("disque size " + computeSizeOnDisk(4096, 5000));
    }
}
