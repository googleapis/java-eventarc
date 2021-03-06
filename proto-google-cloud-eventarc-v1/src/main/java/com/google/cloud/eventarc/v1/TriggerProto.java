/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

public final class TriggerProto {
  private TriggerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Trigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_EventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Transport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_CloudRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_GKE_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_GKE_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Pubsub_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Pubsub_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/eventarc/v1/trigger.proto"
          + "\022\030google.cloud.eventarc.v1\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\263\005\n\007Trigger\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\020\n\003uid\030\002 "
          + "\001(\tB\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\006 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022D\n\r"
          + "event_filters\030\010 \003(\0132%.google.cloud.event"
          + "arc.v1.EventFilterB\006\340A\006\340A\002\022B\n\017service_ac"
          + "count\030\t \001(\tB)\340A\001\372A#\n!iam.googleapis.com/"
          + "ServiceAccount\022?\n\013destination\030\n \001(\0132%.go"
          + "ogle.cloud.eventarc.v1.DestinationB\003\340A\002\022"
          + ";\n\ttransport\030\013 \001(\0132#.google.cloud.eventa"
          + "rc.v1.TransportB\003\340A\001\022B\n\006labels\030\014 \003(\0132-.g"
          + "oogle.cloud.eventarc.v1.Trigger.LabelsEn"
          + "tryB\003\340A\001\022\024\n\007channel\030\r \001(\tB\003\340A\001\022\021\n\004etag\030c"
          + " \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:s\352Ap\n\037eventarc.googleap"
          + "is.com/Trigger\022:projects/{project}/locat"
          + "ions/{location}/triggers/{trigger}*\010trig"
          + "gers2\007trigger\"P\n\013EventFilter\022\026\n\tattribut"
          + "e\030\001 \001(\tB\003\340A\002\022\022\n\005value\030\002 \001(\tB\003\340A\002\022\025\n\010oper"
          + "ator\030\003 \001(\tB\003\340A\001\"\316\001\n\013Destination\0227\n\tcloud"
          + "_run\030\001 \001(\0132\".google.cloud.eventarc.v1.Cl"
          + "oudRunH\000\022J\n\016cloud_function\030\002 \001(\tB0\372A-\n+c"
          + "loudfunctions.googleapis.com/CloudFuncti"
          + "onH\000\022,\n\003gke\030\003 \001(\0132\035.google.cloud.eventar"
          + "c.v1.GKEH\000B\014\n\ndescriptor\"O\n\tTransport\0222\n"
          + "\006pubsub\030\001 \001(\0132 .google.cloud.eventarc.v1"
          + ".PubsubH\000B\016\n\014intermediary\"g\n\010CloudRun\0223\n"
          + "\007service\030\001 \001(\tB\"\340A\002\372A\034\n\032run.googleapis.c"
          + "om/Service\022\021\n\004path\030\002 \001(\tB\003\340A\001\022\023\n\006region\030"
          + "\003 \001(\tB\003\340A\002\"s\n\003GKE\022\024\n\007cluster\030\001 \001(\tB\003\340A\002\022"
          + "\025\n\010location\030\002 \001(\tB\003\340A\002\022\026\n\tnamespace\030\003 \001("
          + "\tB\003\340A\002\022\024\n\007service\030\004 \001(\tB\003\340A\002\022\021\n\004path\030\005 \001"
          + "(\tB\003\340A\001\"7\n\006Pubsub\022\022\n\005topic\030\001 \001(\tB\003\340A\001\022\031\n"
          + "\014subscription\030\002 \001(\tB\003\340A\003B\334\002\n\034com.google."
          + "cloud.eventarc.v1B\014TriggerProtoP\001Z@googl"
          + "e.golang.org/genproto/googleapis/cloud/e"
          + "ventarc/v1;eventarc\352Ak\n+cloudfunctions.g"
          + "oogleapis.com/CloudFunction\022<projects/{p"
          + "roject}/locations/{location}/functions/{"
          + "function}\352AY\n!iam.googleapis.com/Service"
          + "Account\0224projects/{project}/serviceAccou"
          + "nts/{service_account}\352A\037\n\032run.googleapis"
          + ".com/Service\022\001*b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_v1_Trigger_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Trigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Trigger_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "EventFilters",
              "ServiceAccount",
              "Destination",
              "Transport",
              "Labels",
              "Channel",
              "Etag",
            });
    internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor =
        internal_static_google_cloud_eventarc_v1_Trigger_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_eventarc_v1_EventFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_EventFilter_descriptor,
            new java.lang.String[] {
              "Attribute", "Value", "Operator",
            });
    internal_static_google_cloud_eventarc_v1_Destination_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_eventarc_v1_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Destination_descriptor,
            new java.lang.String[] {
              "CloudRun", "CloudFunction", "Gke", "Descriptor",
            });
    internal_static_google_cloud_eventarc_v1_Transport_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Transport_descriptor,
            new java.lang.String[] {
              "Pubsub", "Intermediary",
            });
    internal_static_google_cloud_eventarc_v1_CloudRun_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_CloudRun_descriptor,
            new java.lang.String[] {
              "Service", "Path", "Region",
            });
    internal_static_google_cloud_eventarc_v1_GKE_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_eventarc_v1_GKE_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_GKE_descriptor,
            new java.lang.String[] {
              "Cluster", "Location", "Namespace", "Service", "Path",
            });
    internal_static_google_cloud_eventarc_v1_Pubsub_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_eventarc_v1_Pubsub_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Pubsub_descriptor,
            new java.lang.String[] {
              "Topic", "Subscription",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
