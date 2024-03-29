// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzEngineGetRecordResponseJsonConverter))]
    public class SzEngineGetRecordResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Record Value { get; set; }
    }

    public class SzEngineGetRecordResponseJsonConverter : JsonConverter<SzEngineGetRecordResponse>
    {
        public override SzEngineGetRecordResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzEngineGetRecordResponse { Value = JsonSerializer.Deserialize<Record>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzEngineGetRecordResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Record>(writer, value.Value, options);
        }
    }
}
