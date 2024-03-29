// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzEngineWhyRecordsResponseJsonConverter))]
    public class SzEngineWhyRecordsResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WhyRecords Value { get; set; }
    }

    public class SzEngineWhyRecordsResponseJsonConverter : JsonConverter<SzEngineWhyRecordsResponse>
    {
        public override SzEngineWhyRecordsResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzEngineWhyRecordsResponse { Value = JsonSerializer.Deserialize<WhyRecords>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzEngineWhyRecordsResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WhyRecords>(writer, value.Value, options);
        }
    }
}
