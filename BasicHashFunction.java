serverIndex = hashFunction(key, 3);

public static int hashFunction(int key, int numberOfHost) {
        return key % numberOfHost;
}
