// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta_service.proto

package com.alibaba.maxgraph.proto.store;

public interface StoreInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maxgraph_store.StoreInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional string ip = 2;</code>
   */
  java.lang.String getIp();
  /**
   * <code>optional string ip = 2;</code>
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <code>optional int32 port = 3;</code>
   */
  int getPort();

  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  java.util.List<java.lang.Integer> getPartitionsList();
  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  int getPartitionsCount();
  /**
   * <code>repeated int32 partitions = 4;</code>
   */
  int getPartitions(int index);
}
