package io.nuls.consensus.service.cache;

import io.nuls.core.chain.entity.Block;
import io.nuls.core.chain.entity.Transaction;

/**
 * @author Niels
 * @date 2017/12/12
 */
public class BlockCacheService {
    private static final BlockCacheService INSTANCE = new BlockCacheService();
    private BlockCacheService(){}
    public static BlockCacheService getInstance(){
        return INSTANCE;
    }

    public void cacheBlock(Block block){
        //todo
    }

    public void clear() {
        // todo auto-generated method stub(niels)

    }
}