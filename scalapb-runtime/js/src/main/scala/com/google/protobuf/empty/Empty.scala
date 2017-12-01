// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.empty



/** A generic empty message that you can re-use to avoid defining duplicated
  * empty messages in your APIs. A typical example is to use it as the request
  * or the response type of an API method. For instance:
  *
  *     service Foo {
  *       rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
  *     }
  *
  * The JSON representation for `Empty` is empty JSON object `{}`.
  */
@SerialVersionUID(0L)
final case class Empty(
    ) extends scalapb.GeneratedMessage with scalapb.Message[Empty] with scalapb.lenses.Updatable[Empty] {
    final override def serializedSize: Int = 0
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.empty.Empty = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.empty.Empty(
      )
    }
    def getFieldByNumber(__fieldNumber: Int): scala.Any = throw new MatchError(__fieldNumber)
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = throw new MatchError(__field)
    override def toString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.empty.Empty
}

object Empty extends scalapb.GeneratedMessageCompanion[com.google.protobuf.empty.Empty] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.empty.Empty] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.empty.Empty = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    com.google.protobuf.empty.Empty(
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.empty.Empty] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.empty.Empty(
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = EmptyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = EmptyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.empty.Empty(
  )
  implicit class EmptyLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.empty.Empty]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.empty.Empty](_l) {
  }
}
