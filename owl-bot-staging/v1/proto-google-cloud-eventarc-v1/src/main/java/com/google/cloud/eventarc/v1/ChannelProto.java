// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/channel.proto

package com.google.cloud.eventarc.v1;

public final class ChannelProto {
  private ChannelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_v1_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Channel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/eventarc/v1/channel.proto" +
      "\022\030google.cloud.eventarc.v1\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\363\003\n\007Channel\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\020\n\003uid\030\002 " +
      "\001(\tB\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\006 " +
      "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\025\n\010" +
      "provider\030\007 \001(\tB\003\340A\002\022\033\n\014pubsub_topic\030\010 \001(" +
      "\tB\003\340A\003H\000\022;\n\005state\030\t \001(\0162\'.google.cloud.e" +
      "ventarc.v1.Channel.StateB\003\340A\003\022\035\n\020activat" +
      "ion_token\030\n \001(\tB\003\340A\003\"E\n\005State\022\025\n\021STATE_U" +
      "NSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\n\n\006ACTIVE\020\002\022\014\n" +
      "\010INACTIVE\020\003:s\352Ap\n\037eventarc.googleapis.co" +
      "m/Channel\022:projects/{project}/locations/" +
      "{location}/channels/{channel}*\010channels2" +
      "\007channelB\013\n\ttransportB\304\001\n\034com.google.clo" +
      "ud.eventarc.v1B\014ChannelProtoP\001Z@google.g" +
      "olang.org/genproto/googleapis/cloud/even" +
      "tarc/v1;eventarc\252\002\030Google.Cloud.Eventarc" +
      ".V1\312\002\030Google\\Cloud\\Eventarc\\V1\352\002\033Google:" +
      ":Cloud::Eventarc::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_eventarc_v1_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_v1_Channel_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "Provider", "PubsubTopic", "State", "ActivationToken", "Transport", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
