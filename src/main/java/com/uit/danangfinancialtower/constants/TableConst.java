package com.uit.danangfinancialtower.constants;

/**
 * TableConst
 */
public final class TableConst {

    private TableConst() {
    }

    public static final class TableName {

        private TableName() {
        }

        public static final String NODE = "node";
        public static final String FACE = "face";
        public static final String NODE_FACE = "node_face";
        public static final String TYPE = "type";
        public static final String SYMBOL = "symbol";
        public static final String SYMBOL_TYPE = "symbol_type";
        public static final String SYMBOL_COLOR = "symbol_color";
        public static final String BODY = "body";
    }


    public static final class ColumnName {

        private ColumnName() {
        }

        public static final String NODE_ID = "node_id";
        public static final String FACE_ID = "face_id";
        public static final String TYPE_ID = "type_id";
        public static final String SYMBOL_ID = "symbol_id";
        public static final String SYMBOL_TYPE_ID = "symbol_type_id";
        public static final String SYMBOL_COLOR_ID = "symbol_color_id";
        public static final String BODY_ID = "body_id";
    }
}
