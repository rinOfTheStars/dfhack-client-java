// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ui_sidebar_mode.proto

// Protobuf Java Version: 3.25.1
package main.java.dfproto;

public final class UiSidebarMode {
  private UiSidebarMode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code proto.enums.ui_sidebar_mode.ui_sidebar_mode}
   */
  public enum ui_sidebar_mode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Default = 0;</code>
     */
    Default(0),
    /**
     * <code>Squads = 1;</code>
     */
    Squads(1),
    /**
     * <code>DesignateMine = 2;</code>
     */
    DesignateMine(2),
    /**
     * <code>DesignateRemoveRamps = 3;</code>
     */
    DesignateRemoveRamps(3),
    /**
     * <code>DesignateUpStair = 4;</code>
     */
    DesignateUpStair(4),
    /**
     * <code>DesignateDownStair = 5;</code>
     */
    DesignateDownStair(5),
    /**
     * <code>DesignateUpDownStair = 6;</code>
     */
    DesignateUpDownStair(6),
    /**
     * <code>DesignateUpRamp = 7;</code>
     */
    DesignateUpRamp(7),
    /**
     * <code>DesignateChannel = 8;</code>
     */
    DesignateChannel(8),
    /**
     * <code>DesignateGatherPlants = 9;</code>
     */
    DesignateGatherPlants(9),
    /**
     * <code>DesignateRemoveDesignation = 10;</code>
     */
    DesignateRemoveDesignation(10),
    /**
     * <code>DesignateSmooth = 11;</code>
     */
    DesignateSmooth(11),
    /**
     * <code>DesignateCarveTrack = 12;</code>
     */
    DesignateCarveTrack(12),
    /**
     * <code>DesignateEngrave = 13;</code>
     */
    DesignateEngrave(13),
    /**
     * <code>DesignateCarveFortification = 14;</code>
     */
    DesignateCarveFortification(14),
    /**
     * <code>Stockpiles = 15;</code>
     */
    Stockpiles(15),
    /**
     * <code>Build = 16;</code>
     */
    Build(16),
    /**
     * <code>QueryBuilding = 17;</code>
     */
    QueryBuilding(17),
    /**
     * <code>Orders = 18;</code>
     */
    Orders(18),
    /**
     * <code>OrdersForbid = 19;</code>
     */
    OrdersForbid(19),
    /**
     * <code>OrdersRefuse = 20;</code>
     */
    OrdersRefuse(20),
    /**
     * <code>OrdersWorkshop = 21;</code>
     */
    OrdersWorkshop(21),
    /**
     * <code>OrdersZone = 22;</code>
     */
    OrdersZone(22),
    /**
     * <code>BuildingItems = 23;</code>
     */
    BuildingItems(23),
    /**
     * <code>ViewUnits = 24;</code>
     */
    ViewUnits(24),
    /**
     * <code>LookAround = 25;</code>
     */
    LookAround(25),
    /**
     * <code>DesignateItemsClaim = 26;</code>
     */
    DesignateItemsClaim(26),
    /**
     * <code>DesignateItemsForbid = 27;</code>
     */
    DesignateItemsForbid(27),
    /**
     * <code>DesignateItemsMelt = 28;</code>
     */
    DesignateItemsMelt(28),
    /**
     * <code>DesignateItemsUnmelt = 29;</code>
     */
    DesignateItemsUnmelt(29),
    /**
     * <code>DesignateItemsDump = 30;</code>
     */
    DesignateItemsDump(30),
    /**
     * <code>DesignateItemsUndump = 31;</code>
     */
    DesignateItemsUndump(31),
    /**
     * <code>DesignateItemsHide = 32;</code>
     */
    DesignateItemsHide(32),
    /**
     * <code>DesignateItemsUnhide = 33;</code>
     */
    DesignateItemsUnhide(33),
    /**
     * <code>DesignateChopTrees = 34;</code>
     */
    DesignateChopTrees(34),
    /**
     * <code>DesignateToggleEngravings = 35;</code>
     */
    DesignateToggleEngravings(35),
    /**
     * <code>DesignateToggleMarker = 36;</code>
     */
    DesignateToggleMarker(36),
    /**
     * <code>Hotkeys = 37;</code>
     */
    Hotkeys(37),
    /**
     * <code>DesignateTrafficHigh = 38;</code>
     */
    DesignateTrafficHigh(38),
    /**
     * <code>DesignateTrafficNormal = 39;</code>
     */
    DesignateTrafficNormal(39),
    /**
     * <code>DesignateTrafficLow = 40;</code>
     */
    DesignateTrafficLow(40),
    /**
     * <code>DesignateTrafficRestricted = 41;</code>
     */
    DesignateTrafficRestricted(41),
    /**
     * <code>Zones = 42;</code>
     */
    Zones(42),
    /**
     * <code>ZonesPenInfo = 43;</code>
     */
    ZonesPenInfo(43),
    /**
     * <code>ZonesPitInfo = 44;</code>
     */
    ZonesPitInfo(44),
    /**
     * <code>ZonesHospitalInfo = 45;</code>
     */
    ZonesHospitalInfo(45),
    /**
     * <code>ZonesGatherInfo = 46;</code>
     */
    ZonesGatherInfo(46),
    /**
     * <code>DesignateRemoveConstruction = 47;</code>
     */
    DesignateRemoveConstruction(47),
    /**
     * <code>DepotAccess = 48;</code>
     */
    DepotAccess(48),
    /**
     * <code>NotesPoints = 49;</code>
     */
    NotesPoints(49),
    /**
     * <code>NotesRoutes = 50;</code>
     */
    NotesRoutes(50),
    /**
     * <code>Burrows = 51;</code>
     */
    Burrows(51),
    /**
     * <code>Hauling = 52;</code>
     */
    Hauling(52),
    /**
     * <code>ArenaWeather = 53;</code>
     */
    ArenaWeather(53),
    /**
     * <code>ArenaTrees = 54;</code>
     */
    ArenaTrees(54),
    ;

    /**
     * <code>Default = 0;</code>
     */
    public static final int Default_VALUE = 0;
    /**
     * <code>Squads = 1;</code>
     */
    public static final int Squads_VALUE = 1;
    /**
     * <code>DesignateMine = 2;</code>
     */
    public static final int DesignateMine_VALUE = 2;
    /**
     * <code>DesignateRemoveRamps = 3;</code>
     */
    public static final int DesignateRemoveRamps_VALUE = 3;
    /**
     * <code>DesignateUpStair = 4;</code>
     */
    public static final int DesignateUpStair_VALUE = 4;
    /**
     * <code>DesignateDownStair = 5;</code>
     */
    public static final int DesignateDownStair_VALUE = 5;
    /**
     * <code>DesignateUpDownStair = 6;</code>
     */
    public static final int DesignateUpDownStair_VALUE = 6;
    /**
     * <code>DesignateUpRamp = 7;</code>
     */
    public static final int DesignateUpRamp_VALUE = 7;
    /**
     * <code>DesignateChannel = 8;</code>
     */
    public static final int DesignateChannel_VALUE = 8;
    /**
     * <code>DesignateGatherPlants = 9;</code>
     */
    public static final int DesignateGatherPlants_VALUE = 9;
    /**
     * <code>DesignateRemoveDesignation = 10;</code>
     */
    public static final int DesignateRemoveDesignation_VALUE = 10;
    /**
     * <code>DesignateSmooth = 11;</code>
     */
    public static final int DesignateSmooth_VALUE = 11;
    /**
     * <code>DesignateCarveTrack = 12;</code>
     */
    public static final int DesignateCarveTrack_VALUE = 12;
    /**
     * <code>DesignateEngrave = 13;</code>
     */
    public static final int DesignateEngrave_VALUE = 13;
    /**
     * <code>DesignateCarveFortification = 14;</code>
     */
    public static final int DesignateCarveFortification_VALUE = 14;
    /**
     * <code>Stockpiles = 15;</code>
     */
    public static final int Stockpiles_VALUE = 15;
    /**
     * <code>Build = 16;</code>
     */
    public static final int Build_VALUE = 16;
    /**
     * <code>QueryBuilding = 17;</code>
     */
    public static final int QueryBuilding_VALUE = 17;
    /**
     * <code>Orders = 18;</code>
     */
    public static final int Orders_VALUE = 18;
    /**
     * <code>OrdersForbid = 19;</code>
     */
    public static final int OrdersForbid_VALUE = 19;
    /**
     * <code>OrdersRefuse = 20;</code>
     */
    public static final int OrdersRefuse_VALUE = 20;
    /**
     * <code>OrdersWorkshop = 21;</code>
     */
    public static final int OrdersWorkshop_VALUE = 21;
    /**
     * <code>OrdersZone = 22;</code>
     */
    public static final int OrdersZone_VALUE = 22;
    /**
     * <code>BuildingItems = 23;</code>
     */
    public static final int BuildingItems_VALUE = 23;
    /**
     * <code>ViewUnits = 24;</code>
     */
    public static final int ViewUnits_VALUE = 24;
    /**
     * <code>LookAround = 25;</code>
     */
    public static final int LookAround_VALUE = 25;
    /**
     * <code>DesignateItemsClaim = 26;</code>
     */
    public static final int DesignateItemsClaim_VALUE = 26;
    /**
     * <code>DesignateItemsForbid = 27;</code>
     */
    public static final int DesignateItemsForbid_VALUE = 27;
    /**
     * <code>DesignateItemsMelt = 28;</code>
     */
    public static final int DesignateItemsMelt_VALUE = 28;
    /**
     * <code>DesignateItemsUnmelt = 29;</code>
     */
    public static final int DesignateItemsUnmelt_VALUE = 29;
    /**
     * <code>DesignateItemsDump = 30;</code>
     */
    public static final int DesignateItemsDump_VALUE = 30;
    /**
     * <code>DesignateItemsUndump = 31;</code>
     */
    public static final int DesignateItemsUndump_VALUE = 31;
    /**
     * <code>DesignateItemsHide = 32;</code>
     */
    public static final int DesignateItemsHide_VALUE = 32;
    /**
     * <code>DesignateItemsUnhide = 33;</code>
     */
    public static final int DesignateItemsUnhide_VALUE = 33;
    /**
     * <code>DesignateChopTrees = 34;</code>
     */
    public static final int DesignateChopTrees_VALUE = 34;
    /**
     * <code>DesignateToggleEngravings = 35;</code>
     */
    public static final int DesignateToggleEngravings_VALUE = 35;
    /**
     * <code>DesignateToggleMarker = 36;</code>
     */
    public static final int DesignateToggleMarker_VALUE = 36;
    /**
     * <code>Hotkeys = 37;</code>
     */
    public static final int Hotkeys_VALUE = 37;
    /**
     * <code>DesignateTrafficHigh = 38;</code>
     */
    public static final int DesignateTrafficHigh_VALUE = 38;
    /**
     * <code>DesignateTrafficNormal = 39;</code>
     */
    public static final int DesignateTrafficNormal_VALUE = 39;
    /**
     * <code>DesignateTrafficLow = 40;</code>
     */
    public static final int DesignateTrafficLow_VALUE = 40;
    /**
     * <code>DesignateTrafficRestricted = 41;</code>
     */
    public static final int DesignateTrafficRestricted_VALUE = 41;
    /**
     * <code>Zones = 42;</code>
     */
    public static final int Zones_VALUE = 42;
    /**
     * <code>ZonesPenInfo = 43;</code>
     */
    public static final int ZonesPenInfo_VALUE = 43;
    /**
     * <code>ZonesPitInfo = 44;</code>
     */
    public static final int ZonesPitInfo_VALUE = 44;
    /**
     * <code>ZonesHospitalInfo = 45;</code>
     */
    public static final int ZonesHospitalInfo_VALUE = 45;
    /**
     * <code>ZonesGatherInfo = 46;</code>
     */
    public static final int ZonesGatherInfo_VALUE = 46;
    /**
     * <code>DesignateRemoveConstruction = 47;</code>
     */
    public static final int DesignateRemoveConstruction_VALUE = 47;
    /**
     * <code>DepotAccess = 48;</code>
     */
    public static final int DepotAccess_VALUE = 48;
    /**
     * <code>NotesPoints = 49;</code>
     */
    public static final int NotesPoints_VALUE = 49;
    /**
     * <code>NotesRoutes = 50;</code>
     */
    public static final int NotesRoutes_VALUE = 50;
    /**
     * <code>Burrows = 51;</code>
     */
    public static final int Burrows_VALUE = 51;
    /**
     * <code>Hauling = 52;</code>
     */
    public static final int Hauling_VALUE = 52;
    /**
     * <code>ArenaWeather = 53;</code>
     */
    public static final int ArenaWeather_VALUE = 53;
    /**
     * <code>ArenaTrees = 54;</code>
     */
    public static final int ArenaTrees_VALUE = 54;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ui_sidebar_mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ui_sidebar_mode forNumber(int value) {
      switch (value) {
        case 0: return Default;
        case 1: return Squads;
        case 2: return DesignateMine;
        case 3: return DesignateRemoveRamps;
        case 4: return DesignateUpStair;
        case 5: return DesignateDownStair;
        case 6: return DesignateUpDownStair;
        case 7: return DesignateUpRamp;
        case 8: return DesignateChannel;
        case 9: return DesignateGatherPlants;
        case 10: return DesignateRemoveDesignation;
        case 11: return DesignateSmooth;
        case 12: return DesignateCarveTrack;
        case 13: return DesignateEngrave;
        case 14: return DesignateCarveFortification;
        case 15: return Stockpiles;
        case 16: return Build;
        case 17: return QueryBuilding;
        case 18: return Orders;
        case 19: return OrdersForbid;
        case 20: return OrdersRefuse;
        case 21: return OrdersWorkshop;
        case 22: return OrdersZone;
        case 23: return BuildingItems;
        case 24: return ViewUnits;
        case 25: return LookAround;
        case 26: return DesignateItemsClaim;
        case 27: return DesignateItemsForbid;
        case 28: return DesignateItemsMelt;
        case 29: return DesignateItemsUnmelt;
        case 30: return DesignateItemsDump;
        case 31: return DesignateItemsUndump;
        case 32: return DesignateItemsHide;
        case 33: return DesignateItemsUnhide;
        case 34: return DesignateChopTrees;
        case 35: return DesignateToggleEngravings;
        case 36: return DesignateToggleMarker;
        case 37: return Hotkeys;
        case 38: return DesignateTrafficHigh;
        case 39: return DesignateTrafficNormal;
        case 40: return DesignateTrafficLow;
        case 41: return DesignateTrafficRestricted;
        case 42: return Zones;
        case 43: return ZonesPenInfo;
        case 44: return ZonesPitInfo;
        case 45: return ZonesHospitalInfo;
        case 46: return ZonesGatherInfo;
        case 47: return DesignateRemoveConstruction;
        case 48: return DepotAccess;
        case 49: return NotesPoints;
        case 50: return NotesRoutes;
        case 51: return Burrows;
        case 52: return Hauling;
        case 53: return ArenaWeather;
        case 54: return ArenaTrees;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ui_sidebar_mode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ui_sidebar_mode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ui_sidebar_mode>() {
            public ui_sidebar_mode findValueByNumber(int number) {
              return ui_sidebar_mode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return UiSidebarMode.getDescriptor().getEnumTypes().get(0);
    }

    private static final ui_sidebar_mode[] VALUES = values();

    public static ui_sidebar_mode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ui_sidebar_mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:proto.enums.ui_sidebar_mode.ui_sidebar_mode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ui_sidebar_mode.proto\022\033proto.enums.ui_" +
      "sidebar_mode*\240\t\n\017ui_sidebar_mode\022\013\n\007Defa" +
      "ult\020\000\022\n\n\006Squads\020\001\022\021\n\rDesignateMine\020\002\022\030\n\024" +
      "DesignateRemoveRamps\020\003\022\024\n\020DesignateUpSta" +
      "ir\020\004\022\026\n\022DesignateDownStair\020\005\022\030\n\024Designat" +
      "eUpDownStair\020\006\022\023\n\017DesignateUpRamp\020\007\022\024\n\020D" +
      "esignateChannel\020\010\022\031\n\025DesignateGatherPlan" +
      "ts\020\t\022\036\n\032DesignateRemoveDesignation\020\n\022\023\n\017" +
      "DesignateSmooth\020\013\022\027\n\023DesignateCarveTrack" +
      "\020\014\022\024\n\020DesignateEngrave\020\r\022\037\n\033DesignateCar" +
      "veFortification\020\016\022\016\n\nStockpiles\020\017\022\t\n\005Bui" +
      "ld\020\020\022\021\n\rQueryBuilding\020\021\022\n\n\006Orders\020\022\022\020\n\014O" +
      "rdersForbid\020\023\022\020\n\014OrdersRefuse\020\024\022\022\n\016Order" +
      "sWorkshop\020\025\022\016\n\nOrdersZone\020\026\022\021\n\rBuildingI" +
      "tems\020\027\022\r\n\tViewUnits\020\030\022\016\n\nLookAround\020\031\022\027\n" +
      "\023DesignateItemsClaim\020\032\022\030\n\024DesignateItems" +
      "Forbid\020\033\022\026\n\022DesignateItemsMelt\020\034\022\030\n\024Desi" +
      "gnateItemsUnmelt\020\035\022\026\n\022DesignateItemsDump" +
      "\020\036\022\030\n\024DesignateItemsUndump\020\037\022\026\n\022Designat" +
      "eItemsHide\020 \022\030\n\024DesignateItemsUnhide\020!\022\026" +
      "\n\022DesignateChopTrees\020\"\022\035\n\031DesignateToggl" +
      "eEngravings\020#\022\031\n\025DesignateToggleMarker\020$" +
      "\022\013\n\007Hotkeys\020%\022\030\n\024DesignateTrafficHigh\020&\022" +
      "\032\n\026DesignateTrafficNormal\020\'\022\027\n\023Designate" +
      "TrafficLow\020(\022\036\n\032DesignateTrafficRestrict" +
      "ed\020)\022\t\n\005Zones\020*\022\020\n\014ZonesPenInfo\020+\022\020\n\014Zon" +
      "esPitInfo\020,\022\025\n\021ZonesHospitalInfo\020-\022\023\n\017Zo" +
      "nesGatherInfo\020.\022\037\n\033DesignateRemoveConstr" +
      "uction\020/\022\017\n\013DepotAccess\0200\022\017\n\013NotesPoints" +
      "\0201\022\017\n\013NotesRoutes\0202\022\013\n\007Burrows\0203\022\013\n\007Haul" +
      "ing\0204\022\020\n\014ArenaWeather\0205\022\016\n\nArenaTrees\0206B" +
      "\002H\003"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
