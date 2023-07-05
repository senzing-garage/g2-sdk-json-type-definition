// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(EngineFindNetworkByRecordIdresponseJsonConverter))]
    public class EngineFindNetworkByRecordIdresponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Network Value { get; set; }
    }

    public class EngineFindNetworkByRecordIdresponseJsonConverter : JsonConverter<EngineFindNetworkByRecordIdresponse>
    {
        public override EngineFindNetworkByRecordIdresponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFindNetworkByRecordIdresponse { Value = JsonSerializer.Deserialize<Network>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFindNetworkByRecordIdresponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Network>(writer, value.Value, options);
        }
    }
}