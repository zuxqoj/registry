/**
 * Copyright 2016-2019 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.hortonworks.registries.schemaregistry.serde;

/**
 * This Exception is thrown when any errors occur during serialization/deserialization of a given payload.
 */
public class SerDesException extends RuntimeException {

    public SerDesException() {
    }

    public SerDesException(String message) {
        super(message);
    }

    public SerDesException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerDesException(Throwable cause) {
        super(cause);
    }

    public SerDesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
