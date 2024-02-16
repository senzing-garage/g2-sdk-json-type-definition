// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineWhyRecordsV2responseJsonConverter))]
    public class G2engineWhyRecordsV2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WhyRecords Value { get; set; }
    }

    public class G2engineWhyRecordsV2responseJsonConverter : JsonConverter<G2engineWhyRecordsV2response>
    {
        public override G2engineWhyRecordsV2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineWhyRecordsV2response { Value = JsonSerializer.Deserialize<WhyRecords>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineWhyRecordsV2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WhyRecords>(writer, value.Value, options);
        }
    }
}