// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/google_channel_config.proto

package com.google.cloud.eventarc.v1;

public final class GoogleChannelConfigProto {
  private GoogleChannelConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_v1_GoogleChannelConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_GoogleChannelConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/eventarc/v1/google_channe" +
      "l_config.proto\022\030google.cloud.eventarc.v1" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\037google/protobuf/ti" +
      "mestamp.proto\"\247\002\n\023GoogleChannelConfig\022\021\n" +
      "\004name\030\001 \001(\tB\003\340A\002\0224\n\013update_time\030\006 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\022B\n\017crypto" +
      "_key_name\030\007 \001(\tB)\340A\001\372A#\n!cloudkms.google" +
      "apis.com/CryptoKey:\202\001\352A\177\n+eventarc.googl" +
      "eapis.com/GoogleChannelConfig\022;projects/" +
      "{project}/locations/{location}/googleCha" +
      "nnelConfig2\023googleChannelConfigB\303\002\n\034com." +
      "google.cloud.eventarc.v1B\030GoogleChannelC" +
      "onfigProtoP\001Z8cloud.google.com/go/eventa" +
      "rc/apiv1/eventarcpb;eventarcpb\252\002\030Google." +
      "Cloud.Eventarc.V1\312\002\030Google\\Cloud\\Eventar" +
      "c\\V1\352\002\033Google::Cloud::Eventarc::V1\352Ax\n!c" +
      "loudkms.googleapis.com/CryptoKey\022Sprojec" +
      "ts/{project}/locations/{location}/keyRin" +
      "gs/{key_ring}/cryptoKeys/{crypto_key}b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_eventarc_v1_GoogleChannelConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_GoogleChannelConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_v1_GoogleChannelConfig_descriptor,
        new java.lang.String[] { "Name", "UpdateTime", "CryptoKeyName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
