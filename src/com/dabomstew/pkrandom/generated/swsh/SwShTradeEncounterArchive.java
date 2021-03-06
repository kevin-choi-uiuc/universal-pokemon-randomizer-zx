// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SwShTradeEncounterArchive extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShTradeEncounterArchive getRootAsSwShTradeEncounterArchive(ByteBuffer _bb) { return getRootAsSwShTradeEncounterArchive(_bb, new SwShTradeEncounterArchive()); }
  public static SwShTradeEncounterArchive getRootAsSwShTradeEncounterArchive(ByteBuffer _bb, SwShTradeEncounterArchive obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShTradeEncounterArchive __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter tradeEncounters(int j) { return tradeEncounters(new com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter(), j); }
  public com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter tradeEncounters(com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int tradeEncountersLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter.Vector tradeEncountersVector() { return tradeEncountersVector(new com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter.Vector()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter.Vector tradeEncountersVector(com.dabomstew.pkrandom.generated.swsh.SwShTradeEncounter.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSwShTradeEncounterArchive(FlatBufferBuilder builder,
      int trade_encountersOffset) {
    builder.startTable(1);
    SwShTradeEncounterArchive.addTradeEncounters(builder, trade_encountersOffset);
    return SwShTradeEncounterArchive.endSwShTradeEncounterArchive(builder);
  }

  public static void startSwShTradeEncounterArchive(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addTradeEncounters(FlatBufferBuilder builder, int tradeEncountersOffset) { builder.addOffset(0, tradeEncountersOffset, 0); }
  public static int createTradeEncountersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTradeEncountersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSwShTradeEncounterArchive(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishSwShTradeEncounterArchiveBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedSwShTradeEncounterArchiveBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShTradeEncounterArchive get(int j) { return get(new SwShTradeEncounterArchive(), j); }
    public SwShTradeEncounterArchive get(SwShTradeEncounterArchive obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

