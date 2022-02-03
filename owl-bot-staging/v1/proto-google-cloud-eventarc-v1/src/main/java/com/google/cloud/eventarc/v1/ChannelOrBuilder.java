// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/channel.proto

package com.google.cloud.eventarc.v1;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the channel. Must be unique within the location
   * on the project and must be in
   * `projects/{project}/locations/{location}/channels/{channel_id}` format.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the channel. Must be unique within the location
   * on the project and must be in
   * `projects/{project}/locations/{location}/channels/{channel_id}` format.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4
   * string and guaranteed to remain unchanged until the resource is deleted.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Required. The name of the event provider (e.g. Eventarc SaaS partner) associated
   * with the channel. This provider will be granted permissions to publish
   * events to the channel. Format:
   * `projects/{project}/locations/{location}/providers/{provider_id}`.
   * </pre>
   *
   * <code>string provider = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <pre>
   * Required. The name of the event provider (e.g. Eventarc SaaS partner) associated
   * with the channel. This provider will be granted permissions to publish
   * events to the channel. Format:
   * `projects/{project}/locations/{location}/providers/{provider_id}`.
   * </pre>
   *
   * <code>string provider = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <pre>
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as
   * a transport for the event delivery. Format:
   * `projects/{project}/topics/{topic_id}`.
   * </pre>
   *
   * <code>string pubsub_topic = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pubsubTopic field is set.
   */
  boolean hasPubsubTopic();
  /**
   * <pre>
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as
   * a transport for the event delivery. Format:
   * `projects/{project}/topics/{topic_id}`.
   * </pre>
   *
   * <code>string pubsub_topic = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();
  /**
   * <pre>
   * Output only. The name of the Pub/Sub topic created and managed by Eventarc system as
   * a transport for the event delivery. Format:
   * `projects/{project}/topics/{topic_id}`.
   * </pre>
   *
   * <code>string pubsub_topic = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString
      getPubsubTopicBytes();

  /**
   * <pre>
   * Output only. The state of a Channel.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The state of a Channel.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.eventarc.v1.Channel.State getState();

  /**
   * <pre>
   * Output only. The activation token for the channel. The token must be used by the
   * provider to register the channel for publishing.
   * </pre>
   *
   * <code>string activation_token = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The activationToken.
   */
  java.lang.String getActivationToken();
  /**
   * <pre>
   * Output only. The activation token for the channel. The token must be used by the
   * provider to register the channel for publishing.
   * </pre>
   *
   * <code>string activation_token = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for activationToken.
   */
  com.google.protobuf.ByteString
      getActivationTokenBytes();

  public com.google.cloud.eventarc.v1.Channel.TransportCase getTransportCase();
}
