package com.poiji.internal.marshaller;

import com.poiji.internal.PoijiWorkbook;
import com.poiji.option.PoijiOptions;

import java.util.List;

/**
 * Created by hakan on 17/01/2017.
 */
public abstract class Deserializer {

    public abstract <T> List<T> deserialize(Class<T> type);

    public static Deserializer instance(PoijiWorkbook workbook, PoijiOptions options) {
        return new Unmarshaller(workbook, options);
    }
}
