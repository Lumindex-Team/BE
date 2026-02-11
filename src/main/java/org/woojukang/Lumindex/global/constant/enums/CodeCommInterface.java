package org.woojukang.Lumindex.global.constant.enums;

import org.woojukang.Lumindex.global.constant.serializer.CodeCommDeserializer;
import org.woojukang.Lumindex.global.constant.serializer.CodeCommSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(
        using = CodeCommSerializer.class
)
@JsonDeserialize(
        using = CodeCommDeserializer.class
)
public interface CodeCommInterface {
    String getCode();
    String getCodeName();
}
