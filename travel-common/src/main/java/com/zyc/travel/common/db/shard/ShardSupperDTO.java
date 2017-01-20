package com.zyc.travel.common.db.shard;

/**
 * Created by songxinlei on 2015/12/25.
 */
public abstract class ShardSupperDTO {

    private String shardId;

    private String tableName;

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
