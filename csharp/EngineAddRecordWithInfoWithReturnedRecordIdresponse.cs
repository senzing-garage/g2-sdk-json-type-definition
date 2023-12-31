// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineAddRecordWithInfoWithReturnedRecordIdresponseJsonConverter))]
    public class EngineAddRecordWithInfoWithReturnedRecordIdresponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WithInfo Value { get; set; }
    }

    public class EngineAddRecordWithInfoWithReturnedRecordIdresponseJsonConverter : JsonConverter<EngineAddRecordWithInfoWithReturnedRecordIdresponse>
    {
        public override EngineAddRecordWithInfoWithReturnedRecordIdresponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineAddRecordWithInfoWithReturnedRecordIdresponse { Value = JsonSerializer.Deserialize<WithInfo>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineAddRecordWithInfoWithReturnedRecordIdresponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WithInfo>(writer, value.Value, options);
        }
    }
}
