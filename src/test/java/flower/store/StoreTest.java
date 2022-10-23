package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class StoreTest {
    private static final int QUANTITY = 5;
    private Store store;


    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        FlowerPack rosePack = new FlowerPack(rose, QUANTITY);
        FlowerPack tulipPack = new FlowerPack(tulip, QUANTITY);
//        bucket of roses
        FlowerBucket bucketRose = new FlowerBucket();
        bucketRose.add(rosePack);
//        bucket of tulips
        FlowerBucket bucketTulip = new FlowerBucket();
        bucketTulip.add(tulipPack);
//        bucket of roses and tulips
        FlowerBucket bucketRoseTulip = new FlowerBucket();
        bucketRoseTulip.add(rosePack);
        bucketRoseTulip.add(tulipPack);
//        add buckets to store
        store.addBucket(bucketRose);
        store.addBucket(bucketTulip);
        store.addBucket(bucketRoseTulip);
//        find all buckets with roses
        ArrayList<FlowerBucket> expectedBuckets = new ArrayList<>();
        expectedBuckets.add(bucketRose);
        expectedBuckets.add(bucketRoseTulip);
        Assertions.assertEquals(store.search(rose), expectedBuckets);
    }

}